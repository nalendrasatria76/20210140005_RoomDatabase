package com.example.roomsiswa.repositori

import com.example.roomsiswa.data.SiswaDao
import com.example.roomsiswa.data.Siswa
import kotlinx.coroutines.flow.Flow

class OfflineRepositoriSiswa (private val sIswaDao: SiswaDao):RepositoriSiswa {

    override fun getAllSiswaStream(): Flow<List<Siswa>> = sIswaDao.getAllSiswa()


    override fun getSiswaStream(id: Int): Flow<Siswa?> = sIswaDao.getSiswa(id)


    override suspend fun insertSiswa(siswa: Siswa) = sIswaDao.insert(siswa)


    override suspend fun deleteSiswa(siswa: Siswa) = sIswaDao.delete(siswa)


    override suspend fun updateSiswa(siswa: Siswa) = sIswaDao.update(siswa)
}