package br.senai.sp.jandira.lazycolumnroom.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lazycolumnroom.model.Product

@Composable
fun ProductCard(product: Product) {
  Card(
    modifier = Modifier
      .fillMaxWidth()
      .padding(bottom = 8.dp),
    backgroundColor = Color.LightGray,
  ) {
    Column(
      modifier = Modifier.padding(8.dp)
    ) {
      Text(
        "${product.id} - ${product.name}",
        color = Color.Cyan,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold
      )
      Text("Item ${product.id} - ${product.description}")
      Text(
        "$${product.price}",
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.End
      )
    }
  }
}
