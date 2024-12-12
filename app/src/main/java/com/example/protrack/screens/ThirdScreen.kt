package com.example.protrack.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.protrack.R
import com.example.protrack.navigation.AppNavigation


@Composable
fun ThridScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .requiredWidth(width = 412.dp)
            .requiredHeight(height = 917.dp)
            .background(color = Color(0xffc8c8af))
    ) {
        ElevatedButton(
            onClick = {

            },
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xffe8def8)),
            elevation = ButtonDefaults.buttonElevation(defaultElevation = 5.dp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 39.dp,
                    y = 710.dp)
                .requiredWidth(width = 335.dp)
                .requiredHeight(height = 71.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .requiredWidth(width = 335.dp)
                    .requiredHeight(height = 71.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color(0xff4a4459).copy(alpha = 0.08f))
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.CenterHorizontally),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .requiredWidth(width = 335.dp)
                            .requiredHeight(height = 71.dp)
                            .padding(start = 16.dp,
                                end = 20.dp,
                                top = 16.dp,
                                bottom = 16.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.icon_mod),
                            contentDescription = "Icon",
                            tint = Color(0xff4a4459),
                            modifier = Modifier.size(24.dp)
                        )
                        Text(
                            text = "Modificar",
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
        ElevatedButton(
            onClick = {

            },
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xffe8def8)),
            elevation = ButtonDefaults.buttonElevation(defaultElevation = 5.dp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 39.dp,
                    y = 585.dp)
                .requiredWidth(width = 335.dp)
                .requiredHeight(height = 79.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .requiredWidth(width = 335.dp)
                    .requiredHeight(height = 79.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color(0xff4a4459).copy(alpha = 0.08f))
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.CenterHorizontally),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .requiredWidth(width = 335.dp)
                            .requiredHeight(height = 79.dp)
                            .padding(start = 16.dp,
                                end = 20.dp,
                                top = 16.dp,
                                bottom = 16.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.icon_calend),
                            contentDescription = "Icon",
                            tint = Color(0xff4a4459),
                            modifier = Modifier.size(24.dp)
                        )
                        Text(
                            text = "Calendario",
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
        ElevatedButton(
            onClick = {

            },
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xffe8def8)),
            elevation = ButtonDefaults.buttonElevation(defaultElevation = 5.dp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 40.dp,
                    y = 477.dp)
                .requiredWidth(width = 334.dp)
                .requiredHeight(height = 75.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .requiredWidth(width = 334.dp)
                    .requiredHeight(height = 75.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color(0xff4a4459).copy(alpha = 0.08f))
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.CenterHorizontally),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .requiredWidth(width = 334.dp)
                            .requiredHeight(height = 75.dp)
                            .padding(start = 16.dp,
                                end = 20.dp,
                                top = 16.dp,
                                bottom = 16.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.icon_clock),
                            contentDescription = "Icon",
                            tint = Color(0xff4a4459),
                            modifier = Modifier.size(24.dp)

                        )
                        Text(
                            text = "Ingresar Datos",
                            color = Color(0xff4a4459),
                            textAlign = TextAlign.Center,
                            lineHeight = 1.43.em,
                            style = MaterialTheme.typography.labelLarge,
                            modifier = Modifier
                                .wrapContentHeight(align = Alignment.CenterVertically)
                        )
                    }

                }
            }
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = (-2).dp,
                        y = (-3).dp)
                .padding(50.dp)
                .requiredWidth(width = 414.dp)
                .requiredHeight(height = 65.dp)
                .background(color = Color(0xffd9d9d9))
        )
        Text(
            text = "PROTRACK",
            color = Color.Black,
            textAlign = TextAlign.Center,
            lineHeight = 1.43.em,
            style = MaterialTheme.typography.labelLarge,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 40.dp,
                        y = 3.dp)
                .padding(60.dp)
                .requiredWidth(width = 209.dp)
                .requiredHeight(height = 49.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
    }
}

@Preview(showBackground = true,
    showSystemUi = true)
@Composable
fun ShowDefault(){
    val navController = rememberNavController()
    ThridScreen(navController = navController)
}
