package br.edu.ufab.model.curso;

public class Curso {

		private String nome; 
		private String area; 
		private String tipo; /*Graduação, pós-graduação*/
		
		public Curso (String nome, String area, String tipo){
			this.nome = nome;
			this.area = area;
			this.tipo = tipo;
		}
		
		public String getNome() {
			return nome;
		}
		
		public String getArea() {
			return area;
		}
		
		public String getTipo() {
			return tipo;
		
		}
		
}
