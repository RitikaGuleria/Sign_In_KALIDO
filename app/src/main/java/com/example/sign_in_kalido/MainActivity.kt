package com.example.sign_in_kalido

import android.graphics.Typeface.BOLD
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sign_in_kalido.ui.theme.Sign_In_KALIDOTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Sign_In_KALIDOTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting()
{
   Column()
   {
       Row(modifier = Modifier.background(color = Color.DarkGray).padding(10.dp))
       {
           Image(painter = painterResource(id = R.drawable.ic_baseline_arrow_back_ios_24), contentDescription =null)
           Text(text = stringResource(id = R.string.text1),color= Color.White, modifier = Modifier.fillMaxWidth().wrapContentWidth(Alignment.CenterHorizontally), fontSize = 18.sp)
       }
       Spacer(modifier = Modifier.height(16.dp))
       Text(text = stringResource(id =R.string.text2 ), modifier = Modifier.padding(start=18.dp,end=18.dp), fontSize = 18.sp)
       Spacer(modifier = Modifier.height(16.dp))
       Text(text = stringResource(id = R.string.text3),modifier = Modifier.padding(start=18.dp,end=18.dp),color=Color.Gray)
       Spacer(modifier = Modifier.height(40.dp))
       Practice1()
       Spacer(modifier = Modifier.height(16.dp))
       Practice2()
       Spacer(modifier = Modifier.height(16.dp))
       Practice3()
   }
}

@Composable
fun Practice1()
{
    Row(){
        Button(onClick = { /*TODO*/ },shape= RoundedCornerShape(50), modifier = Modifier
            .fillMaxWidth().height(55.dp)
            .padding(start = 18.dp, end = 18.dp), colors = ButtonDefaults.buttonColors(
            colorResource(id = R.color.teal_700))) {
            Text(text = stringResource(id = R.string.text4), color = Color.White, modifier = Modifier.padding(start = 18.dp, end = 18.dp), fontSize = 18.sp)
        }
    }

}


@Composable
fun Practice2()
{
    Row(){
        Button(onClick = { /*TODO*/ },shape= RoundedCornerShape(50), modifier = Modifier
            .fillMaxWidth().height(55.dp)
            .padding(start = 18.dp, end = 18.dp), colors = ButtonDefaults.buttonColors(
            colorResource(id = R.color.black))) {
            Image(painter = painterResource(id = R.drawable.apple1) , contentDescription = null)
            Text(text = stringResource(id = R.string.text5), color = Color.White, modifier = Modifier.padding(start = 18.dp, end = 18.dp), fontSize = 18.sp)
        }
    }

}

@Composable
fun Practice3()
{
    Row()
    {
        Button(onClick = { /*TODO*/ },shape= RoundedCornerShape(50), modifier = Modifier
            .fillMaxWidth().height(50.dp)
            .padding(start = 18.dp, end = 18.dp), colors = ButtonDefaults.buttonColors(
            colorResource(id = R.color.white))) {
            Image(painter = painterResource(R.drawable.google), contentDescription = null)
            Text(text = stringResource(id = R.string.text6), modifier = Modifier.padding(start=18.dp,end=18.dp),fontSize = 18.sp)
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Sign_In_KALIDOTheme {
        Greeting()
    }
}