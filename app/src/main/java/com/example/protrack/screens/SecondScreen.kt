package com.example.protrack.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.InputChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SecondScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .requiredWidth(width = 412.dp)
            .requiredHeight(height = 917.dp)
            .background(color = Color(0xffc8c8af))
    ) {
        OutlinedTextField(
            value = " ",
            onValueChange = {

            },
            placeholder = { Text("Usuario") },
            supportingText = {
                Text(
                    text = "Usuario",
                    color = Color(0xff65558f),
                    lineHeight = 1.33.em,
                    style = MaterialTheme.typography.bodySmall)
            },
            textStyle = MaterialTheme.typography.bodyLarge,
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.Transparent),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 24.dp,
                    y = 347.dp)
                .requiredWidth(width = 364.dp)
                .requiredHeight(height = 72.dp)
                .clip(shape = RoundedCornerShape(topStart = 4.dp, topEnd = 4.dp)))
        OutlinedTextField(
            value = " ",
            onValueChange = {

            },
            placeholder = { Text("Contraseña") },
            supportingText = {
                Text(
                    text = "Contraseña",
                    color = Color(0xff65558f),
                    style = MaterialTheme.typography.bodySmall)
            },
            textStyle = MaterialTheme.typography.bodyLarge,
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.Transparent),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 24.dp,
                    y = 470.dp)
                .requiredWidth(width = 364.dp)
                .requiredHeight(height = 70.dp)
                .clip(shape = RoundedCornerShape(topStart = 4.dp, topEnd = 4.dp)))
        OutlinedTextField(
            value = " ",
            onValueChange = {

            },
            placeholder = { Text("Gmail") },
            supportingText = {
                Text(
                    text = "Gmail",
                    color = Color(0xff65558f),
                    lineHeight = 1.33.em,
                    style = MaterialTheme.typography.bodySmall)
            },
            textStyle = MaterialTheme.typography.bodyLarge,
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.Transparent),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 24.dp,
                        y = 225.dp)
                .requiredWidth(width = 364.dp)
                .requiredHeight(height = 71.dp)
                .clip(shape = RoundedCornerShape(topStart = 4.dp, topEnd = 4.dp)))
        ElevatedButton(
            onClick = {

            },
            shape = RoundedCornerShape(100.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xfffef7ff).copy(alpha = 0.75f)),
            contentPadding = PaddingValues(horizontal = 24.dp, vertical = 10.dp),
            elevation = ButtonDefaults.buttonElevation(defaultElevation = 1.dp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 30.dp,
                        y = 700.dp)
                .requiredHeight(height = 40.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .requiredHeight(height = 40.dp)
                    .requiredWidth(width =  90.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color(0xff4a4459).copy(alpha = 0.08f))
                ) {
                    Text(
                        text = "REGISTRARSE",
                        color = Color(0xff4a4459),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.labelLarge,
                        modifier = Modifier
                            .wrapContentHeight(align = Alignment.CenterVertically))
                }
            }
        }
        ElevatedButton(
            onClick = {
                navController.popBackStack()
            },
            shape = RoundedCornerShape(100.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xfffef7ff).copy(alpha = 0.75f)),
            contentPadding = PaddingValues(horizontal = 24.dp, vertical = 10.dp),
            elevation = ButtonDefaults.buttonElevation(defaultElevation = 1.dp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 253.dp,
                    y = 700.dp)
                .requiredWidth(width = 134.dp)
                .requiredHeight(height = 40.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .requiredWidth(width = 134.dp)
                    .requiredHeight(height = 40.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color(0xff4a4459).copy(alpha = 0.08f))
                ) {
                    Text(
                        text = "CANCELAR",
                        color = Color(0xff4a4459),
                        textAlign = TextAlign.Center,
                        lineHeight = 1.43.em,
                        style = MaterialTheme.typography.labelLarge,
                        modifier = Modifier
                            .wrapContentHeight(align = Alignment.CenterVertically))
                }
            }
        }

    }
}


