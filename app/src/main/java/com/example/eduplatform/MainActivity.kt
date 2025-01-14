package com.example.eduplatform

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.eduplatform.ui.theme.EduPlatformTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //Qua prendo il WebView dal layout
        val webView: WebView = findViewById(R.id.webview)

        //Abilito js
        webView.settings.javaScriptEnabled = true

        // Imposta un WebViewClient per gestire la navigazione all'interno dell'app
        webView.webViewClient = WebViewClient()

        //Qua carico il sito web
        webView.loadUrl("https://eduplatform-frontend.onrender.com/")
    }
}

