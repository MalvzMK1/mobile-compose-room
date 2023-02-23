package br.senai.sp.jandira.lazycolumnroom.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import br.senai.sp.jandira.lazycolumnroom.model.Product

@Dao
interface ProductDao {
  @Insert
  fun saveProduct(product: Product): Long

  @Delete
  fun deleteProduct(product: Product): Int

  @Query("SELECT * FROM tbl_product ORDER BY tbl_product.name ASC")
  fun getAllProduct(): List<Product>

  @Query("SELECT * FROM tbl_product WHERE tbl_product.id = :id")
  fun getProductById(id: Long): Product
}