package com.example.appbanhang.activity;

// ContactActivity.java

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appbanhang.R;

public class ContactActivity extends AppCompatActivity {

    private EditText txtname;
    private EditText txtEmail;
    private EditText txtMessage;
    private Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        txtname = findViewById(R.id.txtName);
        txtEmail = findViewById(R.id.txtEmail);
        txtMessage = findViewById(R.id.txtMessage);
        buttonSend = findViewById(R.id.buttonSend);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Xử lý logic khi người dùng nhấn nút "Gửi Tin Nhắn"
                String name = txtname.getText().toString().trim();
                String email = txtEmail.getText().toString().trim();
                String message = txtMessage.getText().toString().trim();

                if (isValidInput(name, email, message)) {
                    // Gửi tin nhắn hoặc thực hiện các bước xử lý liên hệ ở đây
                    // (Đây chỉ là ví dụ đơn giản, bạn cần thêm logic xác thực và xử lý)
                    Toast.makeText(ContactActivity.this, "Tin nhắn đã được gửi.", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ContactActivity.this, "Vui lòng nhập đầy đủ thông tin.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    // Phương thức kiểm tra đầu vào hợp lệ
    private boolean isValidInput(String name, String email, String message) {
        return !name.isEmpty() && !email.isEmpty() && !message.isEmpty();
    }
}

