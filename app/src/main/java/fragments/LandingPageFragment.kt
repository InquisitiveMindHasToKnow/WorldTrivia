package fragments

import android.os.Bundle
import android.view.KeyEvent
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import org.ohmstheresistance.worldtrivia.R
import org.ohmstheresistance.worldtrivia.databinding.LandingPageFragmentBinding

class LandingPageFragment : Fragment() {

    private lateinit var landingPageFragmentBinding: LandingPageFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        landingPageFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.landing_page_fragment, container, false)

        landingPageFragmentBinding.startButton.setOnClickListener {

            if(landingPageFragmentBinding.playerNameEdittext.text.toString().isEmpty()){
                Toast.makeText(context, "Please enter your name!", Toast.LENGTH_SHORT).show()
            }else{
                findNavController().navigate(R.id.action_landingPageFragment_to_triviaFragment)
            }
        }
        return landingPageFragmentBinding.root
    }
}