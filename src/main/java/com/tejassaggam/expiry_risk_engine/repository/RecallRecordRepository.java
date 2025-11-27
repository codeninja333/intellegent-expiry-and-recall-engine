package com.tejassaggam.expiry_risk_engine.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.tejassaggam.expiry_risk_engine.entity.RecallRecord;
public interface RecallRecordRepository extends JpaRepository<RecallRecord, Long> {

    List<RecallRecord> findByBatchNumber(String batchNumber);

}