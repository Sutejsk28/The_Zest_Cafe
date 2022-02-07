package com.as2developers.thezestcafe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class Register extends AppCompatActivity {

    public static final String TAG = "TAG";
    EditText mEmail,mPassword,mName;
    Button mRegisterEmail,mLoginWithEmail;
    FirebaseAuth fAuth;
    FirebaseDatabase fData;
    String userid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mEmail=findViewById(R.id.Email);
        mName = findViewById(R.id.Name);
        mPassword=findViewById(R.id.Password);
        mRegisterEmail = findViewById(R.id.RegisterEmail);
        mLoginWithEmail = findViewById(R.id.LoginWithEmail);


        fAuth=FirebaseAuth.getInstance();
        fData = FirebaseDatabase.getInstance();
        if(fAuth.getCurrentUser()!=null){
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
            finish();
        }

        mRegisterEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Password = mPassword.getText().toString().trim();
                String Email =mEmail.getText().toString().trim();
                String Name = mName.getText().toString().trim();

                if(TextUtils.isEmpty(Name)){
                    mName.setError("Name is Required");
                    return;
                }
                if(TextUtils.isEmpty(Password)){
                    mPassword.setError("Password is required!");
                    return;
                }
                if(Password.length()<6){
                    mPassword.setError("Password must be 6 digits long!");
                    return;
                }

                if(TextUtils.isEmpty(Email)){
                    mEmail.setError("Email is required!");
                    return;
                }

                fAuth.createUserWithEmailAndPassword(Email,Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(Register.this,"User Created!",Toast.LENGTH_SHORT).show();
                            userid = fAuth.getCurrentUser().getUid();
                            Map<String,Object> user = new HashMap<>();
                            user.put("Email",Email);
                            user.put("Name", Name);
                            DatabaseReference databaseReference = fData.getReference("Users");
                            databaseReference.child(userid).setValue(user);
                            Toast.makeText(Register.this, "User Registered", Toast.LENGTH_LONG).show();
                            startActivity(new Intent(getApplicationContext(),MainActivity.class));
                            finish();
                        }
                        else{
                            Toast.makeText(Register.this, "Error! "+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
        mLoginWithEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Login.class));
                finish();
            }
        });
        
    }
}