public enum Avaliacao {
    Aluno{
        @Override
        public void funciona() {
            System.out.println("Sou aluno");
        }

        @Override
        public boolean avaliacao(int n) {
            return (n >= 6);
        }
    },
    Professor{
        @Override
        public void funciona() {
            System.out.println("Sou professor");
        }

        @Override
        public boolean avaliacao(int n) {
            return true;
        }
    };

    public abstract void  funciona();
    public abstract boolean avaliacao(int n);
}
