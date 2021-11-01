package ru.spbstu.lab3task5


import android.os.Bundle
import android.view.MenuItem
import ru.spbstu.lab3task5.databinding.Fragment1Binding
import android.view.Menu
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import android.view.*


class Fragment1 : Fragment() {
    private val navigationController by lazy{ findNavController() }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = Fragment1Binding.inflate(layoutInflater)

        binding.toSecond.setOnClickListener {
            navigationController.navigate(R.id.fr1_to_fr2)
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
            R.id.activity_about -> {
                navigationController.navigate(R.id.menu_about)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}