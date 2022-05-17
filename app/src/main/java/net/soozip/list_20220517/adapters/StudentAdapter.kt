package net.soozip.list_20220517.adapters

import android.content.Context
import android.widget.ArrayAdapter
import net.soozip.list_20220517.datas.StudentData

class StudentAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<StudentData>) : ArrayAdapter<StudentData>(mContext, resId, mList) {

}