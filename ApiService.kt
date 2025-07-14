import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("b/MX0A")
    fun getProducts(): Call<ProductResponse>
}