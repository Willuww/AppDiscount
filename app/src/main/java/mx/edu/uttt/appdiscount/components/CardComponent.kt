package mx.edu.uttt.appdiscount.components

import android.inputmethodservice.Keyboard.Row
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.ui.unit.sp

@Composable
fun MainCard(title:String, number:Double,modifier: Modifier=Modifier)
{
    Card(modifier = modifier, colors = CardDefaults.cardColors(
        containerColor = Color.LightGray
    )) {
        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(16.dp)){
            Text(text= title, color = Color.Black, fontSize = 20.sp)
            Text(text = "$$number", color = Color.Black, fontSize = 20.sp)
        }
    }
}

@Composable
fun SecondaryCard(title1: String, numero1:Double,title2:String, numero2:Double)
{
    Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround){
        MainCard(title = title1,
            number = numero1,
            modifier = Modifier
                .padding(start = 30.dp)
                .weight(1f)
        )
        SpaceW(10.dp)
        MainCard(title = title2,
            number = numero2,
            modifier = Modifier
                .padding(start = 30.dp)
                .weight(1f))
    }
}