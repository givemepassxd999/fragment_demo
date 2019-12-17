package example.givemepass.fragmentdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val firstFragment = DetailsFragment(1)
    private val secondFragment = DetailsFragment(2)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addFragment(firstFragment)
        addFragment(secondFragment)
        first_fragment.setOnClickListener {
            replaceFragment(firstFragment)
        }
        second_fragment.setOnClickListener {
            replaceFragment(secondFragment)
        }
    }

    private fun addFragment(f: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragment_container, f)
        transaction.commit()
    }

    private fun replaceFragment(f : Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, f)
        transaction.commit()
    }
}
