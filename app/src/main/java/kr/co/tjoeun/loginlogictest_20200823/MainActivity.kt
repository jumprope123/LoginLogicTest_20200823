package kr.co.tjoeun.loginlogictest_20200823

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LogInBtn.setOnClickListener {

            val id = inputIdTxt.text.toString()
            val pw = inputPassTxt.text.toString()

            if (id == "admin@text.com" && pw=="qwer"){
                Toast.makeText(this,"관리자로그인입니다.",Toast.LENGTH_SHORT).show()
            }
            else
                Toast.makeText(this,"로그인 실패",Toast.LENGTH_SHORT).show()
        }
    }
}
