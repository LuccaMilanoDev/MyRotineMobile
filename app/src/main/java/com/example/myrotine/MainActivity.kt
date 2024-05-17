package com.example.myrotine

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.myrotine.ui.theme.MyRotineTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyRotineTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                            name = "!Android",
                            modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = "\n Hey my name is Lucca, and this is my daily rotine\n",
            modifier = modifier
        )
        Text(
            text = " Acordo as 6 da manha" +
                    "\n Me arrumo e vou pra faculdade"+
                    "\n Chegando la por volta de 7:30"+
                    "\n E saindo de la por volta das 12:50\n"
        )
        Text(
            text = " Chegando em casa almoço e descanso" +
                    "\n Por volta de 15hrs vou para academia"+
                    "\n Chegando em casa tomo banho" +
                    "\n e faço as coisas da faculdade"+
                    "\n Janto e depois estudo e depois durmo\n"
        )
        Image(painter = painterResource(id = R.drawable.img)
            , contentDescription = null)
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyRotineTheme {
        Greeting("!My name is Lucca")
    }
}