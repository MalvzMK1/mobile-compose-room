package br.senai.sp.jandira.lazycolumnroom.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_product")
data class Product(
 @PrimaryKey(autoGenerate = true)
 val id: Long = 0,
 val name: String = "Product Name",
 val description: String = "Product Description... Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis in odio at nibh elementum elementum vel vel lorem. Cras quis tincidunt lacus. Pellentesque fringilla tellus at tempus tincidunt. Curabitur non neque eget nibh cursus elementum vitae id eros. Aenean nec lacus consectetur, viverra justo sit amet, egestas diam. Vestibulum sit amet mi vel urna pulvinar volutpat vitae eget lectus. Vivamus imperdiet convallis nulla nec sodales. Ut aliquam suscipit risus eget mattis. Proin consequat tortor sit amet justo lacinia, pulvinar vulputate felis venenatis. Etiam et nulla placerat, tempus neque bibendum, commodo felis. Praesent at velit nisl.",
 val price: Double = 0.0
)
