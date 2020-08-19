package co.paulfran.viewmodeldemo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import co.paulfran.viewmodeldemo2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        binding.resultTV.text = viewModel.getTotal().toString()

        binding.submitBtn.setOnClickListener {
            viewModel.setTotal(binding.inputET.text.toString().toInt())
            binding.resultTV.text = viewModel.getTotal().toString()
        }
    }
}