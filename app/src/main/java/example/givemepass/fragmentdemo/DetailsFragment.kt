package example.givemepass.fragmentdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_details.view.*


class DetailsFragment(private val index:Int) : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v = LayoutInflater.from(context).inflate(R.layout.fragment_details, container, false)
        v.text_view.text = "Fragment $index"
        return v
    }
}
