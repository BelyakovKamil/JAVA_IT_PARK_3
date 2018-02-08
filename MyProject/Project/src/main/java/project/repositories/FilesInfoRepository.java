package project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import project.models.FileInfo;

public interface FilesInfoRepository extends JpaRepository<FileInfo, Long> {
    FileInfo findOneByStorageName(String fileName);
}
