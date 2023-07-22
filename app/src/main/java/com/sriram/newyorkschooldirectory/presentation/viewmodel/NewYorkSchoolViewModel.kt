package com.sriram.newyorkschooldirectory.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sriram.newyorkschooldirectory.domain.usecase.GetNewYorkSchoolList
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NewYorkSchoolViewModel @Inject constructor(
    private val useCase: GetNewYorkSchoolList
) : ViewModel() {

    val newYorkSchoolFlow = useCase.getNewYorkSchool(scope = viewModelScope)
}