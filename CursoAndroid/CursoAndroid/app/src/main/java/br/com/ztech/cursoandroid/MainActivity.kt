package br.com.ztech.cursoandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    private val TAG = " "



    // Chamado na criação do Activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // Define qual é o layout a ser carregado
        setContentView(R.layout.activity_main)

        // Log da aplicação

       // Log.v(TAG, msg: "Log Verboso")  //imprimi passo a passo
       // Log.d(TAG, msg: "Log Debug")    // chamada de funções, variáveis
       // Log.i(TAG, msg: "Log Info")     // eventos, conexão com sucesso
       // Log.w(TAG, msg: "Log warning")   // só alerta mas não afeta o codigo
       // Log.e(TAG, msg: "Log Error")     // quando ocorre erros, catch
       // Log.wtf(TAG, msg: "log WTF?")    // erro bizarro

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ")
        
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ")
    }



}




