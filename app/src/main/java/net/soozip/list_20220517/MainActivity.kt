package net.soozip.list_20220517

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import net.soozip.list_20220517.adapters.StudentAdapter
import net.soozip.list_20220517.datas.StudentData

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<StudentData>()

    lateinit var mAdapter : StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mStudentList.add(StudentData("최승철", 1995,"서울시 종로구"))
        mStudentList.add(StudentData("윤정한", 1995,"서울시 중구"))
        mStudentList.add(StudentData("홍지수", 1995,"서울시 동대문구"))
        mStudentList.add(StudentData("문준휘", 1996,"서울시 서대문구"))
        mStudentList.add(StudentData("권순영", 1996,"서울시 남대문구"))
        mStudentList.add(StudentData("전원우", 1996,"서울시 강서구"))
        mStudentList.add(StudentData("이지훈", 1996,"서울시 강남구"))
        mStudentList.add(StudentData("서명호", 1997,"서울시 강동구"))
        mStudentList.add(StudentData("김민규", 1997,"서울시 강북구"))
        mStudentList.add(StudentData("이석민", 1997,"서울시 관악구"))
        mStudentList.add(StudentData("부승관", 1998,"서울시 은평구"))
        mStudentList.add(StudentData("최한솔", 1998,"서울시 동작구"))
        mStudentList.add(StudentData("이찬", 1999,"서울시 마포구"))

        mAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)
        studentListView.adapter = mAdapter


        studentListView.setOnItemClickListener { adapterView, view, position, l ->
            //클릭된 학생을 변수에 저장.
            val clickedStudent = mStudentList[position]

            Toast.makeText(this, "${clickedStudent.name} 클릭 됨", Toast.LENGTH_SHORT).show()

        }

        studentListView.setOnItemLongClickListener { adapterView, view, position, l ->
            val clickedStudent = mStudentList[position]
            Toast.makeText(this, "${clickedStudent.name} 길게 클릭 됨", Toast.LENGTH_SHORT).show()

            return@setOnItemLongClickListener true
        }
    }


}