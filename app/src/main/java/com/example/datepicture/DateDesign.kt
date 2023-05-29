package com.example.datepicture

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.datepicture.ui.theme.BlueCustom
import com.example.datepicture.ui.theme.BlueCustom2
import com.example.datepicture.ui.theme.GrayBackground

@Composable
fun BaseOfPicture(){
    val paint = Paint().asFrameworkPaint()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(GrayBackground),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(24.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically

        ) {
            Column() {
                Text(text = "خرداد",fontSize = 16.sp, color = BlueCustom2)
                Text(text = "1402",fontSize = 16.sp, color = BlueCustom2)
            }
            Canvas(
                modifier = Modifier
                    .size(90.dp), onDraw = {
                    drawCircle(color = BlueCustom2)
                    drawIntoCanvas {
                        it.nativeCanvas.drawText("3",120f,120f,paint)
                    }
                }
            )
            Column() {
                Text(text = "     امروز", fontSize = 16.sp, color = BlueCustom2)
                Text(text = "چهارشنبه",fontSize = 16.sp, color = BlueCustom2)
            }
        }
        //middle Row
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),

        ) {
            Row(modifier = Modifier
                .weight(1f)
                .height(150.dp)
                .padding(5.dp)
                .background(BlueCustom2)
                .clip(RoundedCornerShape(50.dp)),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "24", fontSize = 60.sp, color = Color.White)
                Column(){
                    Text(text = "May", fontSize = 32.sp, color = Color.White)
                    Text(text = "2023",fontSize = 32.sp, color = Color.White)
                }
        }
            Row(modifier = Modifier
                .weight(1f)
                .height(150.dp)
                .padding(5.dp)
                .background(BlueCustom2)
                .clip(RoundedCornerShape(50.dp)),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                    Text(text = "4", fontSize = 60.sp, color = Color.White)
                Column(){
                    Text(text = "ذوالقعده", fontSize = 32.sp, color = Color.White)
                    Text(text = "1444",fontSize = 32.sp, color = Color.White)

                }
            }
        }
        //last Row
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .padding(15.dp)
            .background(BlueCustom2)
            .clip(shape = RoundedCornerShape(50.dp)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "مهاتما گاندی: پیروزی آن نیست که هرگز زمین نخوری،آنست که بعداز هرزمین خوردنی برخیزی.",
                fontSize = 18.sp,
                color = Color.White,
                textAlign = TextAlign.Right
            )
        }
    }
}
@Preview
@Composable
fun pre(){
    BaseOfPicture()
}