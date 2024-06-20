package mx.edu.uttt.appdiscount.components


import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import mx.edu.uttt.appdiscount.ui.theme.PrimaryGreen


@Composable
fun Alert(title:String,message:String,confirmText:String,
          onConfirmClick:()->Unit, onDismissClick:()->Unit)
{
    AlertDialog(onDismissRequest = onDismissClick,
        title = { Text(text=title) },
        text = {Text(text=message)},
        confirmButton = {
            Button(
                onClick = { onConfirmClick() },
                colors = ButtonDefaults.buttonColors(
                    containerColor = PrimaryGreen
                )) {
                Text(text = confirmText)
 }
 })
}