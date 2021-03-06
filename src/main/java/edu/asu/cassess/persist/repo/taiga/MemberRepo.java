package edu.asu.cassess.persist.repo.taiga;

import edu.asu.cassess.persist.entity.taiga.MemberData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface MemberRepo extends JpaRepository<MemberData, String> {

}

