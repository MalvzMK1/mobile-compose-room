package br.senai.sp.jandira.lazycolumnroom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lazycolumnroom.components.ProductCard
import br.senai.sp.jandira.lazycolumnroom.dao.repository.ProductRepository
import br.senai.sp.jandira.lazycolumnroom.model.Product
import br.senai.sp.jandira.lazycolumnroom.ui.theme.LazyColumnRoomTheme
import java.security.AllPermission

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      LazyColumnRoomTheme {
        // A surface container using the 'background' color from the theme
        Surface(
          modifier = Modifier.fillMaxSize(),
          color = MaterialTheme.colors.background
        ) {
          LazyColumnCompose()
        }
      }
    }
  }
}

@Composable
fun LazyColumnCompose() {
  Column(
    modifier = Modifier.fillMaxSize()
  ) {
    Text("Lazy Column")
    LazyColumn(
      modifier = Modifier.padding(16.dp)
    ) {
      items(ProductRepository.getAllProducts()) {
        ProductCard(product = it)
      }
    }
  }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  LazyColumnRoomTheme {
    LazyColumnCompose()
  }
}