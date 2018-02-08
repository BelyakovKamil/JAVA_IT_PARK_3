package ru.itpark.news.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itpark.news.models.FileInfo;

public interface FilesInfoRepositoryjj extends JpaRepository<FileInfo, Long> {
    FileInfo findOneByStorageName(String fileName);
}
