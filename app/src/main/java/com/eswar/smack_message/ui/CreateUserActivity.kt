package controler.com.eswar.smack_message.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.eswar.smackthat.R
import kotlinx.android.synthetic.main.activity_create_user.*

class CreateUserActivity : AppCompatActivity() {

    private var userAvatar = "profileDefault"
    var avatarColor = "[0.5,0.5,0.5,1]"  // RGB RED, GREAN, BLUE



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)
    }
    fun generateUserAvatar(view: View){
        val random = java.util.Random()
        val color = random.nextInt(2)
        val avatar = random.nextInt(28)

        userAvatar = if (color== 0){
            "light$avatar"

        } else {
            "dark$avatar"
        }
        val resourseId = resources.getIdentifier(userAvatar,"drawable",packageName)
        createAvatarImageView.setImageResource(resourseId)

    }
    fun generateColorClicked(view: View){

    }
    fun createUserClicked(view: View){

    }
}