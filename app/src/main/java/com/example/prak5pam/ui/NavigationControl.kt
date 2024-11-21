package com.example.prak5pam.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.prak5pam.viewmodel.SiswaViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.prak5pam.model.JenisKel.JenisJk
import com.example.prak5pam.ui.view.FormulirView
import com.example.prak5pam.ui.view.TampilDataView


enum class Halaman{
    FORMULIR,
    TAMPILDATA
}

