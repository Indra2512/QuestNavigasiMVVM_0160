package com.example.navigation.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.navigation.R

@OptIn
@Composable
fun TampilData(
    onBackBtnClick:()-> Unit
){
    val items = listOf(
        Pair(stringResource(id = R.string.nama_lengkap), "Contoh Nama"),
        Pair(stringResource(id = R.string.jenis_kelamin), "Lainnya"),
        Pair(stringResource(id = R.string.alamat), "Yogyakarta")
    )
}