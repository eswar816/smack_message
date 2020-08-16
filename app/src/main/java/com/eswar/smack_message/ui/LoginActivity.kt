package controler.com.eswar.smack_message.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.eswar.smackthat.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


    }
    fun loginLoginBtnClicked(view: View){

    }
    fun loginUserBtnClicked(view: View){
        val createUserIntent = Intent(this, CreateUserActivity::class.java)
        startActivity(createUserIntent)

    }
}