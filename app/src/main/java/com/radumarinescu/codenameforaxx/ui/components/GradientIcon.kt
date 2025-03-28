//package com.radumarinescu.codenameforaxx.ui.components
//
//import androidx.compose.foundation.Canvas
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Brush
//import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
//import androidx.compose.ui.graphics.vector.ImageVector
//import androidx.compose.ui.graphics.vector.rememberVectorPainter
//
//@Composable
//fun GradientIcon(
//    imageVector: ImageVector,
//    gradient: Brush,
//    modifier: Modifier = Modifier
//) {
//    val imageBitmap = rememberVectorPainter(imageVector).apply {
//        setBounds(0, 0, imageVector.defaultWidth.roundToPx(), imageVector.defaultHeight.roundToPx())
//    }.imageVector.asImageBitmap()
//
//    Canvas(modifier = modifier) {
//        drawIntoCanvas { canvas ->
//            canvas.saveLayer(null, null)
//            with(rememberVectorPainter(imageVector)) {
//                draw(size)
//            }
//            canvas.drawRect(
//                left = 0f,
//                top = 0f,
//                right = size.width,
//                bottom = size.height,
//                paint = androidx.compose.ui.graphics.Paint().apply {
//                    brush = gradient
//                    blendMode = androidx.compose.ui.graphics.BlendMode.SrcIn
//                }
//            )
//            canvas.restore()
//        }
//    }
//}
//
//@Preview
//@Composable
//fun GradientIconPreview() {
//    GradientIcon(
//        imageVector = Icons.Filled.Favorite,
//        gradient = Brush.horizontalGradient(
//            colors = listOf(Color.Red, Color.Blue)
//        ),
//        modifier = Modifier.size(100.dp)
//    )
//}
