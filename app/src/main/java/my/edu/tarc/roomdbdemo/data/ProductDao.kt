package my.edu.tarc.roomdbdemo.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ProductDao {
    @Insert
    fun insert(p : Product)

    @Delete
    fun delete(p:Product)

    @Query("Select * From product_table")
    fun getAll() : List<Product>


    @Query ("Select * From product_table WHERE price < :priceRange")
    fun getPriceLessThan(priceRange: Double): List<Product>

}