class UnAuthorizedException extends Exception {
    public UnAuthorizedException(String far) {
        super(far);
    }
}

class ConflictException extends Exception {
    public ConflictException(String ar) {
        super(ar);
    }
}

class BadRequestException extends Exception {
    public BadRequestException(String ras) {
        super(ras);
    }
}

class NotFoundException extends Exception {
    public NotFoundException(String citt) {
        super(citt);
    }
}
