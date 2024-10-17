# c++ development image
FROM ubuntu:24.04

# Install C++ development tools
RUN apt-get update \
    && apt-get install -y \
      build-essential \
      git \
      cmake \
      gdb \
      clang \
      make \
      g++ \
      valgrind \
    && rm -rf /var/lib/apt/lists/*

# Install OpenMP
RUN apt-get update \
    && apt-get install -y \
      libomp-dev \
    && rm -rf /var/lib/apt/lists/*

# Install OpenMPI
RUN apt-get update \
    && apt-get install -y \
      openmpi-bin \
      openmpi-doc \
      libopenmpi-dev \
    && rm -rf /var/lib/apt/lists/*

# Install ANTLR4 \
RUN apt-get update \
    && apt-get install -y \
      antlr4 \
    && rm -rf /var/lib/apt/lists/*

# Install and setup perf profiler
RUN apt-get update \
    && apt-get install -y \
      linux-tools-generic \
    && cp /usr/lib/linux-tools-*/perf /usr/bin/perf \
    && echo kernel.perf_event_paranoid=1 >> /etc/sysctl.d/99-perf.conf \
    && echo kernel.kptr_restrict=0 >> /etc/sysctl.d/99-perf.conf
