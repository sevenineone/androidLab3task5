package ru.spbstu.lab3task5


import android.os.Bundle
import android.view.MenuItem
import ru.spbstu.lab3task5.databinding.Fragment2Binding
import android.view.Menu
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import android.view.*


class Fragment2 : Fragment() {
    private val navigationController by lazy { findNavController() }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = Fragment2Binding.inflate(layoutInflater)

        binding.bnToFirst.setOnClickListener {
            navigationController.navigate(R.id.fr2_to_fr1)
        }
        binding.bnToThird.setOnClickListener {
            navigationController.navigate(R.id.fr2_to_fr3)
        }
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_main, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_about -> {
                navigationController.navigate(R.id.act_about)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}