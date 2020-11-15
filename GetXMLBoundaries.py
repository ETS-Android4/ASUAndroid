def GetXMLBoundaries(n):
   storeArr = []
   z=1
   for i in range(n):
        this = '''
                <ImageView
                    android:id="@+id/ribbon%s_2"
                    android:layout_width="35dp"
                    android:layout_height="35dp"
                    app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                    app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                    app:layout_constraintStart_toStartOf="@id/ribbon%s"
                    app:layout_constraintTop_toTopOf="@id/ribbon%s" />

                <ImageView
                    android:id="@+id/ribbon%s_3"
                    android:layout_width="35dp"
                    android:layout_height="35dp"
                    android:layout_marginStart="20dp"
                    android:layout_marginLeft="20dp"
                    app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                    app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                    app:layout_constraintStart_toStartOf="@id/ribbon%s"
                    app:layout_constraintTop_toTopOf="@id/ribbon%s" />

                <ImageView
                    android:id="@+id/ribbon%s_4"
                    android:layout_width="35dp"
                    android:layout_height="35dp"
                    android:layout_marginEnd="20dp"
                    android:layout_marginRight="20dp"
                    app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                    app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                    app:layout_constraintStart_toStartOf="@id/ribbon%s"
                    app:layout_constraintTop_toTopOf="@id/ribbon%s" />

                <ImageView
                    android:id="@+id/ribbon%s_5"
                    android:layout_width="35dp"
                    android:layout_height="35dp"
                    android:layout_marginStart="40dp"
                    android:layout_marginLeft="40dp"
                    app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                    app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                    app:layout_constraintStart_toStartOf="@id/ribbon%s"
                    app:layout_constraintTop_toTopOf="@id/ribbon%s"
                    app:layout_constraintVertical_bias="0.555" />

                <ImageView
                    android:id="@+id/ribbon%s_6"
                    android:layout_width="35dp"
                    android:layout_height="35dp"
                    android:layout_marginEnd="40dp"
                    android:layout_marginRight="40dp"
                    app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                    app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                    app:layout_constraintStart_toStartOf="@id/ribbon%s"
                    app:layout_constraintTop_toTopOf="@id/ribbon%s" />

                <ImageView
                    android:id="@+id/ribbon%s_7"
                    android:layout_width="35dp"
                    android:layout_height="35dp"
                    android:layout_marginStart="60dp"
                    android:layout_marginLeft="60dp"
                    app:layout_constraintBottom_toBottomOf="@id/ribbon%s"
                    app:layout_constraintEnd_toEndOf="@+id/ribbon%s"
                    app:layout_constraintHorizontal_bias=".50"
                    app:layout_constraintStart_toStartOf="@id/ribbon%s"
                    app:layout_constraintTop_toTopOf="@id/ribbon%s" />

                <ImageView
                    android:id="@+id/ribbon%s_8"
                    android:layout_width="35dp"
                    android:layout_height="35dp"
                    android:layout_marginEnd="60dp"
                    android:layout_marginRight="60dp"
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