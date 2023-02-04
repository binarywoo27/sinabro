package com.ssafy.osws.lecture.data.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity 
@Table(name="lecture")
public class Lecture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int no;
	
	@Column(name="subject", nullable=false)
	private String subject;
	
	@Column(name="start_date", nullable=false)
	private Date startDate;
	
	@Column(name="end_date", nullable=false)
	private Date endDate;
	
	@Column(name="original_name", nullable=true)
	private String originalName;
	
	@Column(name="saved_name", nullable=true)
	private String savedName;
	
	@Column(name="teacher_to_lecture", nullable=false)
	private int teacherToLecture;

	@Column(name="content", nullable=true)
	private String content;
	
	@Column(name="max_occupancy", nullable=false)
	private int maxOccupancy;

	@Builder
	public Lecture(int no, String subject, Date startDate, Date endDate, String originalName, String savedName,
			int teacherToLecture, String content, int maxOccupancy) {
		this.no = no;
		this.subject = subject;
		this.startDate = startDate;
		this.endDate = endDate;
		this.originalName = originalName;
		this.savedName = savedName;
		this.teacherToLecture = teacherToLecture;
		this.content = content;
		this.maxOccupancy = maxOccupancy;
	}
}