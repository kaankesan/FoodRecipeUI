package com.kaankesan.foodrecipes

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kaankesan.foodrecipes.ui.theme.FoodRecipesTheme
import com.kaankesan.foodrecipes.ui.theme.contentColor
import com.kaankesan.foodrecipes.ui.theme.red
import com.kaankesan.foodrecipes.ui.theme.yellow

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodRecipesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainPage()
                }
            }
        }
    }
}

@Composable
fun MainPage(){
    val context = LocalContext.current
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Food Recipe")},
                contentColor = contentColor(),
                backgroundColor = yellow
            )
        },

        content = {
            Column(horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.yemekresim),
                    contentDescription = ""
                )
                Row(Modifier.fillMaxWidth()) {
                    Button(
                        onClick = {Toast.makeText(context,"Liked",Toast.LENGTH_SHORT).show()},
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = red
                        ),
                        modifier = Modifier
                            .weight(50f)
                            .padding(5.dp)
                    ) {
                        Text(text = "Like")
                    }
                    Button(
                        onClick = {Toast.makeText(context,"Comment",Toast.LENGTH_SHORT).show()},
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = yellow
                        ),
                        modifier = Modifier
                            .weight(50f)
                            .padding(5.dp)
                    ) {
                        Text(text = "Comment")
                    }
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp, top = 5.dp),
                ) {
                    Text(text = "Köfte", color = yellow, fontSize = 20.sp)
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween
                        , modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = "Ready",
                            color = contentColor(),
                            fontSize = 20.sp,
                            modifier = Modifier.padding(top = 5.dp)
                        )
                        Text(
                            text = "17 October",
                            color = contentColor(),
                            fontSize = 20.sp,
                            modifier = Modifier.padding(end = 10.dp, top = 5.dp)
                        )
                    }
                    Spacer(modifier = Modifier.padding(all = 10.dp))
                    Text(
                        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Sodales neque sodales ut etiam sit amet nisl purus. Ipsum nunc aliquet bibendum enim facilisis gravida neque convallis. Enim praesent elementum facilisis leo. Purus semper eget duis at tellus at. Maecenas ultricies mi eget mauris pharetra et ultrices neque ornare. Mi ipsum faucibus vitae aliquet nec. Purus semper eget duis at tellus at. Pharetra vel turpis nunc eget lorem dolor. Tempor orci dapibus ultrices in iaculis nunc."
                    )
                }
            }
        }
    )
}

