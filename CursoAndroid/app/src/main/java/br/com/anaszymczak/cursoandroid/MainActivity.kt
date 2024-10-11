package br.com.anaszymczak.cursoandroid

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button
    private lateinit var registerLink: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameEditText = findViewById(R.id.username)
        passwordEditText = findViewById(R.id.password)
        loginButton = findViewById(R.id.login_button)
        registerLink = findViewById(R.id.register_link)

        loginButton.setOnClickListener {
            login()
        }

        registerLink.setOnClickListener {
            // Aqui você pode adicionar a lógica para abrir a tela de cadastro
            Toast.makeText(this, "Abrindo tela de cadastro", Toast.LENGTH_SHORT).show()
            // Exemplo: startActivity(Intent(this, RegisterActivity::class.java))
        }
    }

    private fun login() {
        val username = usernameEditText.text.toString().trim()
        val password = passwordEditText.text.toString().trim()

        // Verificando se os campos estão preenchidos
        if (username.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Por favor, preencha todos os campos", Toast.LENGTH_SHORT).show()
        } else {
            // Simulação de login
            if (username == "admin" && password == "senha") {
                // Sucesso no login
                Toast.makeText(this, "Login bem-sucedido!", Toast.LENGTH_SHORT).show()
                startNextMatchingActivity()
                // Aqui você pode iniciar outra Activity após o login
                // startActivity(Intent(this, HomeActivity::class.java))
            } else {
                // Falha no login
                Toast.makeText(this, "Usuário ou senha incorretos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
