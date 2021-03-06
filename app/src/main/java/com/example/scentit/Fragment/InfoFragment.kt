package com.example.scentit.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.LinearLayout
import com.example.scentit.R
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class InfoFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        configureInfoFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_info, container, false)
    }

//    private fun configureInfoFragment(){
//        findViewById<ImageButton>(R.id.imageButton1).setOnClickListener{ //fragmentContainerView 위치에 lion 넣어라
//            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, Info1Fragment()).commit()
//        }
//        findViewById<ImageButton>(R.id.imageButton2).setOnClickListener{
//            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, Info2Fragment()).commit()
//        }
//        findViewById<ImageButton>(R.id.imageButton3).setOnClickListener{
//            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, Info3Fragment()).commit()
//        }
//    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            InfoFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}