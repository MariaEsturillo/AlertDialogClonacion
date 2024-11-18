package com.example.alertdialogclonacion

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import javax.xml.validation.SchemaFactoryLoader

@OptIn(androidx. compose. material3.ExperimentalMaterial3Api::class)
@Composable
fun Boton1(onDismissRequest: () -> Unit,
           onConfirmation: () -> Unit,
           dialogTitle: String,
           dialogText: String){
    var openDialog by rememberSaveable { mutableStateOf(false) }
    var enabledButton by rememberSaveable { mutableStateOf(true) }
    var textoconfirmacion by rememberSaveable { mutableStateOf(" ") }
    if (enabledButton) {
        OutlinedButton(
            onClick = {
                openDialog=true
                enabledButton=false
            },
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFe41857)),
            modifier = Modifier.padding(20.dp, 40.dp, 20.dp, 0.dp)
                .size(150.dp)
        ) {
            Text("CONFIRMAR", fontSize = 16.sp, fontWeight = FontWeight.Black)
        }
    }
    if(openDialog){
        BasicAlertDialog(onDismissRequest = {
                openDialog=false
                enabledButton=true
        }){
            Surface (
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight(),
                shape=MaterialTheme.shapes.large,
                tonalElevation = AlertDialogDefaults.TonalElevation
            )
            { Column(modifier = Modifier.padding(16.dp)) {
                Text(dialogTitle, fontWeight = FontWeight.Bold)
                Text(dialogText)
                Spacer(modifier = Modifier.height(24.dp))
                TextButton(
                    onClick = { openDialog = false
                        enabledButton=true

                        textoconfirmacion ="Acción confirmada"
                              },
                    modifier = Modifier.shadow(1.dp, shape = MaterialTheme.shapes.small)
                ) {
                    Text("Si")
                }
                Spacer(modifier = Modifier.height(24.dp))
                TextButton(
                    onClick = { openDialog = false
                        enabledButton=true
                        textoconfirmacion=" "},
                    modifier = Modifier.shadow(1.dp, shape = MaterialTheme.shapes.small)
                ) {
                    Text("No")
                }
            } }

        }

    }
    Text(textoconfirmacion, fontSize = 16.sp , color = Color.White, modifier = Modifier.padding(20.dp, 15.dp, 20.dp, 0.dp))

}
@OptIn(androidx. compose. material3.ExperimentalMaterial3Api::class)
@Composable
fun Boton2(onDismissRequest: () -> Unit,
           onConfirmation: () -> Unit,
           dialogTitle: String,
           dialogText: String){
    var openDialog by rememberSaveable { mutableStateOf(false) }
    var enabledButton by rememberSaveable { mutableStateOf(true) }
    var textoconfirmacion by rememberSaveable { mutableStateOf(" ") }
    if (enabledButton) {
    OutlinedButton(
        onClick = { openDialog=true
            enabledButton=false},
        shape = CircleShape,
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFff7400)),
        modifier = Modifier.padding(20.dp,40.dp,20.dp,0.dp)
                            .size(150.dp)
    ) {
        Text("ELIMINAR",fontSize = 16.sp, fontWeight = FontWeight.Black)
    }
    }
    if(openDialog){
        BasicAlertDialog(onDismissRequest = {
            openDialog=false
            enabledButton=true
        }){
            Surface (
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight(),
                shape=MaterialTheme.shapes.large,
                tonalElevation = AlertDialogDefaults.TonalElevation
            )
            { Column(modifier = Modifier.padding(16.dp)) {
                Text(dialogTitle, fontWeight = FontWeight.Bold)
                Text(dialogText)
                Spacer(modifier = Modifier.height(24.dp))
                TextButton(
                    onClick = { openDialog = false
                        enabledButton=true

                        textoconfirmacion ="Item eliminado"
                    },
                    modifier = Modifier.shadow(1.dp, shape = MaterialTheme.shapes.small)
                ) {
                    Text("Eliminar")
                }
                Spacer(modifier = Modifier.height(24.dp))
                TextButton(
                    onClick = { openDialog = false
                        enabledButton=true
                        textoconfirmacion =" "},
                    modifier = Modifier.shadow(1.dp, shape = MaterialTheme.shapes.small)
                ) {
                    Text("Cancelar")
                }
            } }

        }

    }
    Text(textoconfirmacion, fontSize = 16.sp , color = Color.White, modifier = Modifier.padding(20.dp, 15.dp, 20.dp, 0.dp))
}
@OptIn(androidx. compose. material3.ExperimentalMaterial3Api::class)
@Composable
fun Boton3(
    onDismissRequest: () -> Unit,
    onConfirmation: () -> Unit,
    dialogTitle: String,
    Icon: ImageVector,
    dialogText: String,

){
    var openDialog by rememberSaveable { mutableStateOf(false) }
    var enabledButton by rememberSaveable { mutableStateOf(true) }
    if (enabledButton) {
        OutlinedButton(
            onClick = {openDialog=true
                enabledButton=false},
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF18e4a5)),
            modifier = Modifier.padding(20.dp, 40.dp, 20.dp, 0.dp)
                .size(150.dp)
        ) { Text("INFORMACIÓN", fontSize = 14.sp, fontWeight = FontWeight.Black) }
    }
    if(openDialog){
        BasicAlertDialog(onDismissRequest = {
            openDialog=false
            enabledButton=true
        }){
            Surface (
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight(),
                shape=MaterialTheme.shapes.large,
                tonalElevation = AlertDialogDefaults.TonalElevation
            )
            { Column(modifier = Modifier.padding(16.dp)) {
                Image(Icon, contentDescription = null, modifier = Modifier.size(32.dp)
                    .align(Alignment.CenterHorizontally))
                Spacer(modifier = Modifier.height(24.dp))
                Text(dialogTitle, fontWeight = FontWeight.Bold)
                Text(dialogText)
                Spacer(modifier = Modifier.height(24.dp))
                TextButton(
                    onClick = { openDialog = false
                        enabledButton=true


                    },
                    modifier = Modifier.shadow(1.dp, shape = MaterialTheme.shapes.small)
                ) {
                    Text("Entendido")
                }
            } }

        }

    }
}
@OptIn(androidx. compose. material3.ExperimentalMaterial3Api::class)
@Composable
fun Boton4(onDismissRequest: () -> Unit,
           onConfirmation: () -> Unit,
           dialogTitle: String,
           dialogText: String,
           dialogTitle2: String,
           dialogText2: String){
    var openDialog by rememberSaveable { mutableStateOf(false) }
    var enabledButton by rememberSaveable { mutableStateOf(true) }
    var openDialogAut by rememberSaveable { mutableStateOf(false) }
    var textoconfirmacion by rememberSaveable { mutableStateOf(" ") }
    var mail by rememberSaveable { mutableStateOf(" ") }
    var contrasenia by rememberSaveable { mutableStateOf(" ") }
    if (enabledButton) {
        OutlinedButton(
            onClick = {openDialog=true
                enabledButton=false},
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF3f18e4)),
            modifier = Modifier.padding(20.dp, 40.dp, 20.dp, 0.dp)
                .size(150.dp)
        ) { Text("AUTENTICACIÓN", fontSize = 13.sp, fontWeight = FontWeight.Black) }
    }
    if(openDialog){
        BasicAlertDialog(onDismissRequest = {
            openDialog=false
            enabledButton=true
        }){
            Surface (
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight(),
                shape=MaterialTheme.shapes.large,
                tonalElevation = AlertDialogDefaults.TonalElevation
            )
            { Column(modifier = Modifier.padding(16.dp)) {

                Spacer(modifier = Modifier.height(24.dp))
                Text(dialogTitle, fontWeight = FontWeight.Bold)
                Text(dialogText)

                Spacer(modifier = Modifier.height(24.dp))
                TextButton(
                    onClick = { openDialog = false
                        enabledButton=true
                        openDialogAut=true

                    },
                    modifier = Modifier.shadow(1.dp, shape = MaterialTheme.shapes.small)
                ) {
                    Text("Autenticar")
                }
                Spacer(modifier = Modifier.height(24.dp))
                TextButton(
                    onClick = { openDialog = false
                        enabledButton=true
                        textoconfirmacion =" "},
                    modifier = Modifier.shadow(1.dp, shape = MaterialTheme.shapes.small)
                ) {
                    Text("Cancelar")
                }
            } }

        }

    }
    if(openDialogAut){
        BasicAlertDialog(onDismissRequest= {
            openDialogAut = false
            enabledButton= true
        }) {  Surface (
            modifier = Modifier
                .wrapContentWidth()
                .wrapContentHeight(),
            shape=MaterialTheme.shapes.large,
            tonalElevation = AlertDialogDefaults.TonalElevation
        )
        { Column(modifier = Modifier.padding(16.dp)) {

            Spacer(modifier = Modifier.height(24.dp))
            Text(dialogTitle2, fontWeight = FontWeight.Bold)
            Text(dialogText2)
            Text("Email")
            TextField(
                value = mail,
                onValueChange = {mail=it}
            )
            Spacer(modifier = Modifier.height(24.dp))
            Text("Contraseña")
            TextField(
                value = contrasenia,
                onValueChange = {contrasenia=it}
            )
            Spacer(modifier = Modifier.height(24.dp))
            TextButton(
                onClick = { openDialogAut = false
                    enabledButton=true
                    textoconfirmacion ="Usuario Autenticado"
                },
                modifier = Modifier.shadow(1.dp, shape = MaterialTheme.shapes.small)
            ) {
                Text("Autenticar")
            }
            Spacer(modifier = Modifier.height(24.dp))
            TextButton(
                onClick = { openDialogAut = false
                    enabledButton=true
                    },
                modifier = Modifier.shadow(1.dp, shape = MaterialTheme.shapes.small)
            ) {
                Text("Cancelar")
            }
        } }}

    }
    Text(textoconfirmacion,fontSize = 16.sp , color = Color.White, modifier = Modifier.padding(20.dp, 20.dp, 20.dp, 0.dp))
}
@OptIn(androidx. compose. material3.ExperimentalMaterial3Api::class)
@Composable
fun Boton5(onDismissRequest: () -> Unit,
           onConfirmation: () -> Unit,
           dialogTitle: String,
           dialogText: String,
           dialogTitle2: String,
           dialogText2: String){
    var openDialog by rememberSaveable { mutableStateOf(false) }
    var enabledButton by rememberSaveable { mutableStateOf(true) }
    var openDialogAut by rememberSaveable { mutableStateOf(false) }
    if (enabledButton) {
        OutlinedButton(
            onClick = {openDialog=true
                enabledButton=false},
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
            modifier = Modifier.padding(20.dp, 20.dp, 20.dp, 0.dp)
                .size(150.dp)

        ) { Text("ERROR", fontSize = 16.sp, fontWeight = FontWeight.Black) }
    }
    if(openDialog){
        BasicAlertDialog(onDismissRequest = {
            openDialog=false
            enabledButton=true
        }){
            Surface (
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight(),
                shape=MaterialTheme.shapes.large,
                tonalElevation = AlertDialogDefaults.TonalElevation
            )
            { Column(modifier = Modifier.padding(16.dp)) {

                Spacer(modifier = Modifier.height(24.dp))
                Text(dialogTitle, fontWeight = FontWeight.Bold)
                Text(dialogText)

                Spacer(modifier = Modifier.height(24.dp))
                TextButton(
                    onClick = { openDialog = false
                        enabledButton=true
                        openDialogAut=true

                    },
                    modifier = Modifier.shadow(1.dp, shape = MaterialTheme.shapes.small)
                ) {
                    Text("Reintentar")
                }
                Spacer(modifier = Modifier.height(24.dp))
                TextButton(
                    onClick = { openDialog = false
                        enabledButton=true
                        },
                    modifier = Modifier.shadow(1.dp, shape = MaterialTheme.shapes.small)
                ) {
                    Text("Cancelar")
                }
            } }

        }

    }
    if(openDialogAut){
        BasicAlertDialog(onDismissRequest= {
            openDialogAut = false
            enabledButton= true
        }) {  Surface (
            modifier = Modifier
                .wrapContentWidth()
                .wrapContentHeight(),
            shape=MaterialTheme.shapes.large,
            tonalElevation = AlertDialogDefaults.TonalElevation
        )
        { Column(modifier = Modifier.padding(16.dp)) {

            Spacer(modifier = Modifier.height(24.dp))
            Text(dialogTitle2, fontWeight = FontWeight.Bold)
            Text(dialogText2)

            Spacer(modifier = Modifier.height(24.dp))
            TextButton(
                onClick = { openDialogAut = false
                    enabledButton=true
                },
                modifier = Modifier.shadow(1.dp, shape = MaterialTheme.shapes.small)
            ) {
                Text("Cerrar")
            }
        } }}

    }
}