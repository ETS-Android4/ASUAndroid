def GetXMLBoundaries(n):
   storeArr = []
   z=1
   for i in range(n):
        this = '''
            <ImageView
                android:id="@+id/ribbon%s_2"
                android:layout_width="@dimen/_18sdp"
                android:layout_height="@dimen/_18sdp"
                android:rotation="-10"
                app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                app:layout_constraintStart_toStartOf="@id/ribbon%s"
                app:layout_constraintTop_toTopOf="@id/ribbon%s" />

            <ImageView
                android:id="@+id/ribbon%s_3"
                android:layout_width="@dimen/_18sdp"
                android:layout_height="@dimen/_18sdp"
                android:layout_marginStart="@dimen/_11sdp"
                android:layout_marginLeft="@dimen/_11sdp"
                android:rotation="-10"
                app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                app:layout_constraintStart_toStartOf="@id/ribbon%s"
                app:layout_constraintTop_toTopOf="@id/ribbon%s" />

            <ImageView
                android:id="@+id/ribbon%s_4"
                android:layout_width="@dimen/_18sdp"
                android:layout_height="@dimen/_18sdp"
                android:layout_marginEnd="@dimen/_11sdp"
                android:layout_marginRight="@dimen/_11sdp"
                android:rotation="-10"
                app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                app:layout_constraintStart_toStartOf="@id/ribbon%s"
                app:layout_constraintTop_toTopOf="@id/ribbon%s" />

            <ImageView
                android:id="@+id/ribbon%s_5"
                android:layout_width="@dimen/_18sdp"
                android:layout_height="@dimen/_18sdp"
                android:layout_marginEnd="@dimen/_22sdp"
                android:layout_marginRight="@dimen/_22sdp"
                android:rotation="-10"
                app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                app:layout_constraintStart_toStartOf="@id/ribbon%s"
                app:layout_constraintTop_toTopOf="@id/ribbon%s"
                app:layout_constraintVertical_bias="0.555" />

            <ImageView
                android:id="@+id/ribbon%s_6"
                android:layout_width="@dimen/_18sdp"
                android:layout_height="@dimen/_18sdp"
                android:layout_marginStart="@dimen/_22sdp"
                android:layout_marginLeft="@dimen/_22sdp"
                android:rotation="-10"
                app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                app:layout_constraintStart_toStartOf="@id/ribbon%s"
                app:layout_constraintTop_toTopOf="@id/ribbon%s" />

            <ImageView
                android:id="@+id/ribbon%s_7"
                android:layout_width="@dimen/_18sdp"
                android:layout_height="@dimen/_18sdp"
                android:layout_marginStart="@dimen/_33sdp"
                android:layout_marginLeft="@dimen/_33sdp"
                android:rotation="-10"
                app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                app:layout_constraintHorizontal_bias=".50"
                app:layout_constraintStart_toStartOf="@id/ribbon%s"
                app:layout_constraintTop_toTopOf="@id/ribbon%s" />

            <ImageView
                android:id="@+id/ribbon%s_8"
                android:layout_width="@dimen/_18sdp"
                android:layout_height="@dimen/_18sdp"
                android:layout_marginEnd="@dimen/_33sdp"
                android:layout_marginRight="@dimen/_33sdp"
                android:rotation="-10"
                app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                app:layout_constraintHorizontal_bias="0.50"
                app:layout_constraintStart_toStartOf="@id/ribbon%s"
                app:layout_constraintTop_toTopOf="@id/ribbon%s"
                app:layout_constraintVertical_bias="0.50" />
                    '''%(z,z,z,z,z,z,z,z,z,z,z,z,z,z,z,z,z,z,z,z,z,z,z,z,z,z,z,z,z,z,z,z,z,z,z)
        print(this)
        z+=1
        file1 = open("this.txt","a")  
        file1.writelines(this)

GetXMLBoundaries(50)