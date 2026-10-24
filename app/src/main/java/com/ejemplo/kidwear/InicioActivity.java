package com.ejemplo.kidwear;

import android.os.Bundle;
import android.util.Patterns;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;

public class InicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        EditText etEmail = findViewById(R.id.et_email);
        EditText etPassword = findViewById(R.id.et_password);
        MaterialCheckBox cbTerminos = findViewById(R.id.cb_terminos);
        MaterialButton btnLogin = findViewById(R.id.btn_login);
        MaterialButton btnGoogle = findViewById(R.id.btn_google);
        TextView tvOlvidoPassword = findViewById(R.id.tv_olvido_password);
        TextView tvRegistro = findViewById(R.id.tv_registro);

        btnLogin.setOnClickListener(v -> {
            String email = etEmail.getText().toString().trim();
            String password = etPassword.getText().toString().trim();

            if (email.isEmpty()) {
                etEmail.setError("Introduce tu correo electrónico");
                etEmail.requestFocus();
            } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                etEmail.setError("Formato de correo no válido");
                etEmail.requestFocus();
            } else if (password.isEmpty()) {
                etPassword.setError("Introduce tu contraseña");
                etPassword.requestFocus();
            } else if (password.length() < 6) {
                etPassword.setError("La contraseña debe tener al menos 6 caracteres");
                etPassword.requestFocus();
            } else if (!cbTerminos.isChecked()) {
                Toast.makeText(this, "Debes aceptar los términos y condiciones", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Iniciando sesión...", Toast.LENGTH_SHORT).show();
            }
        });

        btnGoogle.setOnClickListener(v ->
                Toast.makeText(this, "Conectando con Google...", Toast.LENGTH_SHORT).show()
        );

        tvOlvidoPassword.setOnClickListener(v ->
                Toast.makeText(this, "Recuperación de contraseña", Toast.LENGTH_SHORT).show()
        );

        tvRegistro.setOnClickListener(v ->
                Toast.makeText(this, "Navegando a pantalla de registro", Toast.LENGTH_SHORT).show()
        );
    }
}