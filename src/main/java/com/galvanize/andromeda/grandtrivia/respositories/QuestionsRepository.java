package com.galvanize.andromeda.grandtrivia.respositories;

import com.galvanize.andromeda.grandtrivia.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionsRepository extends JpaRepository<Question, Long> {
}
