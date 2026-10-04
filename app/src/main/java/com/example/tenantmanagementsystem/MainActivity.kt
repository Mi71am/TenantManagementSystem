package com.example.tenantmanagementsystem
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.tenantmanagementsystem.databinding.ActivityMainBinding
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.net.Uri


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)


        setContentView(binding.root)

        binding.saveButton.setOnClickListener {

            val name = binding.tenantNameEditText.text.toString()

            val phone = binding.phoneEditText.text.toString()

            val rent = binding.rentEditText.text.toString()

            binding.tenantResultTextView.text =
                "Tenant: $name\nPhone: $phone\nRent: KSh $rent"
        }

//        val tenantNameEditText =
//            findViewById<EditText>(R.id.tenantNameEditText)
//
//        val phoneEditText =
//            findViewById<EditText>(R.id.phoneEditText)
//
//        val rentEditText =
//            findViewById<EditText>(R.id.rentEditText)
//
//        val saveButton =
//            findViewById<Button>(R.id.saveButton)
//
//        val tenantResultTextView =
//            findViewById<TextView>(R.id.tenantResultTextView)
//
//        saveButton.setOnClickListener {
//
//            val name = tenantNameEditText.text.toString()
//            val phone = phoneEditText.text.toString()
//            val rent = rentEditText.text.toString()
//
//            tenantResultTextView.text =
//                "Tenant: $name\nPhone: $phone\nRent Paid: $rent"
//        }

    }
}