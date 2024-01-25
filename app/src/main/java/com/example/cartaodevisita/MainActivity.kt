package com.example.cartaodevisita

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartaodevisita.ui.theme.CartaoDeVisitaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartaoDeVisitaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CartaoVisita()
                }
            }
        }
    }
}
@Composable
fun CartaoVisita(){
    Column(
        modifier = with(Modifier) {
            background(Color.Red)
                .fillMaxWidth()
                .fillMaxHeight()
        },
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = CenterHorizontally,
    ) {
        val image = painterResource(R.drawable.android_logo)
        Image(
            painter = image,
            contentDescription = null
        )
        Text(
            text = stringResource(R.string.nome_text),
            modifier = Modifier.padding(top = 1.dp, bottom = 8.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp
        )
        Text(
            text = stringResource(R.string.profissao_text),
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp
        )
        Column {
            Text(
                text = stringResource(R.string.telelefone_cel),
                modifier = Modifier.padding(start = 60.dp,top = 84.dp, bottom = 2.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
            Text(
                text = stringResource(R.string.email_text),
                modifier = Modifier.padding(top = 8.dp, bottom = 2.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
        }
    }
    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        CartaoDeVisitaTheme {
            CartaoVisita()
        }
    }
}