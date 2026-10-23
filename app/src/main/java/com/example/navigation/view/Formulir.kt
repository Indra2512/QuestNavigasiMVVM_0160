package com.example.navigation.view

import android.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    jenisK:List<String> = listOf("laki-laki", "Perempuan"),
    OnSubmitBtnClick : () -> Unit
){
    Scaffold (modifier = Modifier,
        {
            TopAppBar(
                title = { Text(stringResource(id = R.string.home), color = Color.White)},
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    colorResource(id = R.color.teal_700))
            )}
    ){
        }
    }
}