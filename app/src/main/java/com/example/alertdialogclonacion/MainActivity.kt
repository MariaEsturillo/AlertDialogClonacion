package com.example.alertdialogclonacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.alertdialogclonacion.ui.theme.AlertDialogClonacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AlertDialogClonacionTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
@Composable
fun Composicion() {
    val openAlertDialog = remember { mutableStateOf(false) }

    Row(modifier = Modifier.fillMaxSize()
        .background(Color.DarkGray),

        Arrangement.Center,
        Alignment.CenterVertically
        ) {

        Column(
            modifier = Modifier

                .padding(0.dp,0.dp,0.dp,0.dp),
            Arrangement.SpaceBetween,
            horizontalAlignment  = Alignment.CenterHorizontally

            ) {

            Boton1(onDismissRequest = {openAlertDialog.value=false },
                onConfirmation = {openAlertDialog.value=false
                   },
                "Confirmación de Acción",
                "¿Estás seguro de que deseas continuar con esta acción?")
            Boton2(onDismissRequest = {openAlertDialog.value=false},
                onConfirmation = {openAlertDialog.value=false},
                dialogTitle = "Eliminar elemento",
                dialogText = "Esta acción es irreversible. ¿Deseas eliminar este elemento?")
        }
        Column(
            modifier = Modifier
                .padding(0.dp,0.dp,0.dp,0.dp),
            Arrangement.SpaceBetween,
            horizontalAlignment  = Alignment.CenterHorizontally

            ) {
            Boton3(
                onDismissRequest = {openAlertDialog.value=false},
                onConfirmation = {openAlertDialog.value=false},
                dialogTitle = "Aviso Importante",
                Icon = Icons.Filled.Warning,
                dialogText = "Recuerda que los cambios realizados no se pueden deshacer.")

            Boton4(onDismissRequest = {openAlertDialog.value=false},
                onConfirmation = {openAlertDialog.value=false},
                dialogTitle = "Requiere Autenticación",
                dialogText = "Para continuar, necesitas autenticarte de nuevo.",
                dialogTitle2 = "Autenticación",
                dialogText2 = "Introduzca su mail y contraseña")

            Boton5(onDismissRequest = {openAlertDialog.value=false},
                onConfirmation = {openAlertDialog.value=false},
                dialogTitle = "Error Crítico",
                dialogText = "Se ha producido un error crítico. ¿Deseas intentar nuevamente?",
                dialogTitle2 = "Resolución de error",
                dialogText2 = "Intento de Reintento")
        }

    }


}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Composicion()
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AlertDialogClonacionTheme {
        Greeting("Android")
    }
}